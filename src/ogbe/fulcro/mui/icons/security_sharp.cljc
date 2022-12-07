(ns ogbe.fulcro.mui.icons.security-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SecuritySharp" :default SecuritySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecuritySharp)))