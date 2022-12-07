(ns ogbe.fulcro.mui.icons.extension-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionTwoTone" :default ExtensionTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionTwoTone)))