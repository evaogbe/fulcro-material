(ns ogbe.fulcro.mui.icons.git-hub
  #?(:cljs (:require
            ["@mui/icons-material/GitHub" :default GitHub]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-git-hub
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GitHub)))