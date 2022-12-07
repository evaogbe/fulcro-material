(ns ogbe.fulcro.mui.icons.restore-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RestoreRounded" :default RestoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restore-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestoreRounded)))