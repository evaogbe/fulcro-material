(ns ogbe.fulcro.mui.icons.mode-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ModeTwoTone" :default ModeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeTwoTone)))