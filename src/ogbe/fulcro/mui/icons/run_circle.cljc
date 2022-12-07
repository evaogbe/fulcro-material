(ns ogbe.fulcro.mui.icons.run-circle
  #?(:cljs (:require
            ["@mui/icons-material/RunCircle" :default RunCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-run-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RunCircle)))