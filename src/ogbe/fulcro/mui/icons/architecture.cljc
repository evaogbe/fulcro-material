(ns ogbe.fulcro.mui.icons.architecture
  #?(:cljs (:require
            ["@mui/icons-material/Architecture" :default Architecture]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-architecture
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Architecture)))