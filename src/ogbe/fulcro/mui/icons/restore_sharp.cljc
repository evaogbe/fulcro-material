(ns ogbe.fulcro.mui.icons.restore-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RestoreSharp" :default RestoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restore-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestoreSharp)))