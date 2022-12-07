(ns ogbe.fulcro.mui.icons.mode-edit
  #?(:cljs (:require
            ["@mui/icons-material/ModeEdit" :default ModeEdit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-edit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeEdit)))