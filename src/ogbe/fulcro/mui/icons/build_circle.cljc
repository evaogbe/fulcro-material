(ns ogbe.fulcro.mui.icons.build-circle
  #?(:cljs (:require
            ["@mui/icons-material/BuildCircle" :default BuildCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BuildCircle)))