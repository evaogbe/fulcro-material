(ns ogbe.fulcro.mui.icons.logout-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LogoutOutlined" :default LogoutOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logout-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoutOutlined)))