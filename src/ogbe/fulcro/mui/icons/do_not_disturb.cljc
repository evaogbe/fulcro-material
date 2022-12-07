(ns ogbe.fulcro.mui.icons.do-not-disturb
  #?(:cljs (:require
            ["@mui/icons-material/DoNotDisturb" :default DoNotDisturb]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-do-not-disturb
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoNotDisturb)))