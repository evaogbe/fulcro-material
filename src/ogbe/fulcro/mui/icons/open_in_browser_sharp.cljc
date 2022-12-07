(ns ogbe.fulcro.mui.icons.open-in-browser-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OpenInBrowserSharp" :default OpenInBrowserSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-browser-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInBrowserSharp)))