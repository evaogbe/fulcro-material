(ns ogbe.fulcro.mui.icons.wc
  #?(:cljs (:require
            ["@mui/icons-material/Wc" :default Wc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wc)))