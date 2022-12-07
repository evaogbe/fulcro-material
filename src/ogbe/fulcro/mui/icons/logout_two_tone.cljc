(ns ogbe.fulcro.mui.icons.logout-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LogoutTwoTone" :default LogoutTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logout-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoutTwoTone)))