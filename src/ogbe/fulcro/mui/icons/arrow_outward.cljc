(ns ogbe.fulcro.mui.icons.arrow-outward
  #?(:cljs (:require
            ["@mui/icons-material/ArrowOutward" :default ArrowOutward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-outward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowOutward)))