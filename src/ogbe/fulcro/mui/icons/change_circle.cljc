(ns ogbe.fulcro.mui.icons.change-circle
  #?(:cljs (:require
            ["@mui/icons-material/ChangeCircle" :default ChangeCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-change-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChangeCircle)))