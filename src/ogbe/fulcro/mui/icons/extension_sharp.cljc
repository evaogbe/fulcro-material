(ns ogbe.fulcro.mui.icons.extension-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionSharp" :default ExtensionSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionSharp)))