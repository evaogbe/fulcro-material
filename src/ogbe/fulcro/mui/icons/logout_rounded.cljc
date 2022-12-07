(ns ogbe.fulcro.mui.icons.logout-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LogoutRounded" :default LogoutRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logout-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoutRounded)))