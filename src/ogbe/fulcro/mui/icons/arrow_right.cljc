(ns ogbe.fulcro.mui.icons.arrow-right
  #?(:cljs (:require
            ["@mui/icons-material/ArrowRight" :default ArrowRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowRight)))