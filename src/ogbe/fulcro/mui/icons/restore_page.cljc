(ns ogbe.fulcro.mui.icons.restore-page
  #?(:cljs (:require
            ["@mui/icons-material/RestorePage" :default RestorePage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restore-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestorePage)))