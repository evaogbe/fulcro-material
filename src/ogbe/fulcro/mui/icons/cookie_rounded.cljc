(ns ogbe.fulcro.mui.icons.cookie-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CookieRounded" :default CookieRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cookie-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CookieRounded)))