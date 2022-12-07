(ns ogbe.fulcro.mui.icons.flaky
  #?(:cljs (:require
            ["@mui/icons-material/Flaky" :default Flaky]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flaky
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flaky)))