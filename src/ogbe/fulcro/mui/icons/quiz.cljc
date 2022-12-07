(ns ogbe.fulcro.mui.icons.quiz
  #?(:cljs (:require
            ["@mui/icons-material/Quiz" :default Quiz]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-quiz
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Quiz)))