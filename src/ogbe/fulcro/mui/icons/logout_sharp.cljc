(ns ogbe.fulcro.mui.icons.logout-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LogoutSharp" :default LogoutSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logout-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoutSharp)))