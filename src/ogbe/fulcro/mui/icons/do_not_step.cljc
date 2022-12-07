(ns ogbe.fulcro.mui.icons.do-not-step
  #?(:cljs (:require
            ["@mui/icons-material/DoNotStep" :default DoNotStep]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-do-not-step
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoNotStep)))