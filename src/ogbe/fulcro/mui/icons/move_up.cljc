(ns ogbe.fulcro.mui.icons.move-up
  #?(:cljs (:require
            ["@mui/icons-material/MoveUp" :default MoveUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-move-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoveUp)))