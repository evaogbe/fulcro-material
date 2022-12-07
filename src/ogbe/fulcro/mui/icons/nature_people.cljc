(ns ogbe.fulcro.mui.icons.nature-people
  #?(:cljs (:require
            ["@mui/icons-material/NaturePeople" :default NaturePeople]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nature-people
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NaturePeople)))