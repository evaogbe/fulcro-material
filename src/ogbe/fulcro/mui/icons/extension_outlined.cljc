(ns ogbe.fulcro.mui.icons.extension-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionOutlined" :default ExtensionOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionOutlined)))