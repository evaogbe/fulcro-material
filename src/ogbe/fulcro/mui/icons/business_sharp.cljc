(ns ogbe.fulcro.mui.icons.business-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BusinessSharp" :default BusinessSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-business-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BusinessSharp)))