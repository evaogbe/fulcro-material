(ns ogbe.fulcro.mui.icons.airlines
  #?(:cljs (:require
            ["@mui/icons-material/Airlines" :default Airlines]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airlines
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Airlines)))