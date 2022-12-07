(ns ogbe.fulcro.mui.icons.app-registration-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AppRegistrationSharp" :default AppRegistrationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-registration-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppRegistrationSharp)))