(ns ogbe.fulcro.mui.icons.cookie-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CookieOutlined" :default CookieOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cookie-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CookieOutlined)))