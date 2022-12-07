(ns ogbe.fulcro.mui.icons.mode-comment
  #?(:cljs (:require
            ["@mui/icons-material/ModeComment" :default ModeComment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-comment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeComment)))