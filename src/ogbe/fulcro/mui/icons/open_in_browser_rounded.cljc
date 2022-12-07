(ns ogbe.fulcro.mui.icons.open-in-browser-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OpenInBrowserRounded" :default OpenInBrowserRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-browser-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInBrowserRounded)))