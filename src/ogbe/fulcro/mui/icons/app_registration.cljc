(ns ogbe.fulcro.mui.icons.app-registration
  #?(:cljs (:require
            ["@mui/icons-material/AppRegistration" :default AppRegistration]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-app-registration
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppRegistration)))