(ns ogbe.fulcro.mui.icons.person-outline
  #?(:cljs (:require
            ["@mui/icons-material/PersonOutline" :default PersonOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonOutline)))