(ns ogbe.fulcro.mui.icons.arrow-back
  #?(:cljs (:require
            ["@mui/icons-material/ArrowBack" :default ArrowBack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-back
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowBack)))