(ns ogbe.fulcro.mui.icons.agriculture
  #?(:cljs (:require
            ["@mui/icons-material/Agriculture" :default Agriculture]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-agriculture
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Agriculture)))