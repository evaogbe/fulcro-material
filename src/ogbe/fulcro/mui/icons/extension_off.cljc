(ns ogbe.fulcro.mui.icons.extension-off
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionOff" :default ExtensionOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionOff)))