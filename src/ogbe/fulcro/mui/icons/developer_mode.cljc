(ns ogbe.fulcro.mui.icons.developer-mode
  #?(:cljs (:require
            ["@mui/icons-material/DeveloperMode" :default DeveloperMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-developer-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeveloperMode)))