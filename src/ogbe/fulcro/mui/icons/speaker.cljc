(ns ogbe.fulcro.mui.icons.speaker
  #?(:cljs (:require
            ["@mui/icons-material/Speaker" :default Speaker]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Speaker)))