(ns ogbe.fulcro.mui.icons.castle
  #?(:cljs (:require
            ["@mui/icons-material/Castle" :default Castle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-castle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Castle)))