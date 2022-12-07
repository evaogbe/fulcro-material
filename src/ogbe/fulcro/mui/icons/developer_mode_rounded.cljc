(ns ogbe.fulcro.mui.icons.developer-mode-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DeveloperModeRounded" :default DeveloperModeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-developer-mode-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeveloperModeRounded)))