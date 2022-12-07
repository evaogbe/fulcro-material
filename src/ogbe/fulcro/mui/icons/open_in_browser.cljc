(ns ogbe.fulcro.mui.icons.open-in-browser
  #?(:cljs (:require
            ["@mui/icons-material/OpenInBrowser" :default OpenInBrowser]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-browser
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInBrowser)))