(ns ogbe.fulcro.mui.icons.browser-not-supported
  #?(:cljs (:require
            ["@mui/icons-material/BrowserNotSupported" :default BrowserNotSupported]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-browser-not-supported
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrowserNotSupported)))