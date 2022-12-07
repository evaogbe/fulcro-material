(ns ogbe.fulcro.mui.icons.build-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BuildRounded" :default BuildRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BuildRounded)))