(ns ogbe.fulcro.mui.icons.move-down
  #?(:cljs (:require
            ["@mui/icons-material/MoveDown" :default MoveDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-move-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoveDown)))