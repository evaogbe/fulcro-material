(ns ogbe.fulcro.mui.icons.abc-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AbcRounded" :default AbcRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-abc-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AbcRounded)))