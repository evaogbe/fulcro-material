(ns ogbe.fulcro.mui.icons.tapas-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TapasTwoTone" :default TapasTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tapas-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapasTwoTone)))