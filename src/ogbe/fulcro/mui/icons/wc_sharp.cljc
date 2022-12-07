(ns ogbe.fulcro.mui.icons.wc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WcSharp" :default WcSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WcSharp)))