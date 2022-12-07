(ns ogbe.fulcro.mui.icons.four-k
  #?(:cljs (:require
            ["@mui/icons-material/FourK" :default FourK]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-four-k
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FourK)))