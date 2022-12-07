(ns ogbe.fulcro.mui.icons.auto-fix-normal
  #?(:cljs (:require
            ["@mui/icons-material/AutoFixNormal" :default AutoFixNormal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-fix-normal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoFixNormal)))