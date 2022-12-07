(ns ogbe.fulcro.mui.icons.do-disturb
  #?(:cljs (:require
            ["@mui/icons-material/DoDisturb" :default DoDisturb]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-do-disturb
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoDisturb)))