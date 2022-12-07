(ns ogbe.fulcro.mui.icons.cookie-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CookieSharp" :default CookieSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cookie-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CookieSharp)))